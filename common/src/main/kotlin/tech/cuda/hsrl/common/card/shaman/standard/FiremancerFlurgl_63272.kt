package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FiremancerFlurgl_63272 : Card() {
    override val id = 63272
    override val name = "火焰术士弗洛格尔"
    override val description = "在你使用一张鱼人牌后，对所有敌人造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "毒舌术士，火力全开。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d0fa3936af4f6c34cbe7e38015b18eebce4b9bfc2423a4c80f2987ed64d1360f.png"
}
