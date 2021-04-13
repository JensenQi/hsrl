package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rancor_63119 : Card() {
    override val id = 63119
    override val name = "仇怨累积"
    override val description = "对所有随从造成 2点伤害。每消灭一个随从，获得2点 护甲值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "人类智者说：“只有愚者才会向前猛突，忘乎所以。”而兽人智者的说法完全相反。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6af0ed4a451b468858f40484632cf337e349d756441840c329f3d989108fa853.png"
}
