package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HarvestGolem_69972 : Card() {
    override val id = 69972
    override val name = "麦田傀儡"
    override val description = "<b>亡语：</b>召唤一个2/1的损坏的傀儡。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "“温度过高。系统失灵。二号仓粮食堵塞。正在关闭。”"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f3d1fe6f2b5bb701e14a0f3059e80b85f52b38118e5a7f038310ed6401b894a.png"
}
