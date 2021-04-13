package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RazorfenBeastmaster_63164 : Card() {
    override val id = 63164
    override val name = "剃刀沼泽兽王"
    override val description = "<b>亡语：</b>从你的手牌中召唤一个法力值消耗小于或等于（4）点的<b>亡语</b>随从。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "跑团的时候，这是我最喜欢的进阶职业。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ca4263acdd5ce5f0455a4a06b2813e4042df5232c3cc9ccf63f027be15a6183a.png"
}
