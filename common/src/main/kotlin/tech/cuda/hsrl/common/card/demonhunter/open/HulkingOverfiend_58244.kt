package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HulkingOverfiend_58244 : Card() {
    override val id = 58244
    override val name = "巨型大恶魔"
    override val description = "<b>突袭</b> 在该随从攻击并消灭一个随从后，可再次攻击。"
    override var cost: Int? = 8
    override var health: Int? = 10
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "身形巨大，也许还是恶魔：唉，麻烦就在这儿。"
    override val artist = "Bayard Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fde86080cee8f138045dc21cfc8d1e8d0919831d1a75272648a71294c3aa8df9.png"
}
