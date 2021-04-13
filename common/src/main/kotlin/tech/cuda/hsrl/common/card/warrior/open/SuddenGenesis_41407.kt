package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SuddenGenesis_41407 : Card() {
    override val id = 41407
    override val name = "基因转接"
    override val description = "复制所有受伤的友方随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Ungoro
    override val background = "有些伤会让你变成另外一个人。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/56bb7f390d495a99d172dbf1fdd0246cade4ada7ffa512030f9c4849840ed14c.png"
}
