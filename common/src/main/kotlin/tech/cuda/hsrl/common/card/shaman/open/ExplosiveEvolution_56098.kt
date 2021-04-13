package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ExplosiveEvolution_56098 : Card() {
    override val id = 56098
    override val name = "惊爆异变"
    override val description = "将一个随从随机变形成为一个法力值消耗增加（3）点的 随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "一起为地精的实验助一臂之力！"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf9422973ca74b3bda88b5a9bc2b67a5b55068f5290ba579baeb195be13a0bf7.png"
}
