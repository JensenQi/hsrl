package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IllidariFelblade_58524 : Card() {
    override val id = 58524
    override val name = "伊利达雷邪刃武士"
    override val description = "<b>突袭</b> <b>流放：</b>在本回合中获得<b>免疫</b>。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "恶魔自有恶人磨。"
    override val artist = "Angelica Alieva"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b394b187d12c9e0910443b867e01b50eb38ef9cb256a59b3de157dfea2273f27.png"
}
