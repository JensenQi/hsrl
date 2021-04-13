package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CallToArms_43384 : Card() {
    override val id = 43384
    override val name = "战斗号角"
    override val description = "<b>招募</b>三个法力值消耗小于或等于（2）点的随从。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "有了手机还要号角干什么？"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f4a4e5fdf5bdf9bfe1b2ad7df04f3ce80e0c1735d43a8fb40491f9e6b9cde419.png"
}
