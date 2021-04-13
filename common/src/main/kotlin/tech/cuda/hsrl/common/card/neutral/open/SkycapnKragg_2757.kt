package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkycapnKragg_2757 : Card() {
    override val id = 2757
    override val name = "天空上尉库拉格"
    override val description = "<b>冲冲冲冲锋</b> 每有一个友方海盗，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "骑乘红色鹦鹉，装备颚骨护肩，手持弯钩长枪，头戴海盗船帽。还能有比他更拉风的首领吗？没有！"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/28af9795eac22f813d63f08dd7a970794fb5f283a35f6c76d855392f12454722.png"
}
