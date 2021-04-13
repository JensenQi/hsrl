package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConvictionRank1_62947 : Card() {
    override val id = 62947
    override val name = "定罪（等级1）"
    override val description = "随机使一个友方随从获得+3攻击力。<i>（当你有5点法力值时升级。）</i>"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "那天，是凯瑞尔的信仰之力鼓舞了北方城堡的北卫军士兵。她的大锤反而没造成什么伤害。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d383260df62c88decf888e483a1832390a68caccabda11f490df24451ed88373.png"
}
