package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Revolve_61222 : Card() {
    override val id = 61222
    override val name = "异变轮转"
    override val description = "随机将所有随从变形成为法力值消耗相同的随从。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“请勿在进食后三十分钟内乘坐旋转木马。我是说木马进食后。”"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b99da7548acdfd58330eb6affee13da209da69a0f04c07ef61b93a709aab52f.png"
}
