package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class QuartzElemental_46737 : Card() {
    override val id = 46737
    override val name = "石英元素"
    override val description = "受伤时无法攻击。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "除了石英元素外，还有长石元素和云母元素，它们全都来自于花岗岩元素。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/42caa03b3020a2ef7fb9681dd75300e5af106edbcd8d97466cc4123a2c22b918.png"
}
