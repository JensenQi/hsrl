package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HarvestGolem_778 : Card() {
    override val id = 778
    override val name = "麦田傀儡"
    override val description = "<b>亡语：</b>召唤一个2/1的损坏的傀儡。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "“温度过高。系统失灵。二号仓粮食堵塞。正在关闭。”"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2bc14efe32e4caba754361775f54250a72807f96454acec61ac4fa6a17923d4e.png"
}
