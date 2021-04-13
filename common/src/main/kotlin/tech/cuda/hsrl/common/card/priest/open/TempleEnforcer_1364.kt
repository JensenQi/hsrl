package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TempleEnforcer_1364 : Card() {
    override val id = 1364
    override val name = "圣殿执行者"
    override val description = "<b>战吼：</b>使一个友方随从获得+3生命值。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "他在每周四的夜晚都会悄然出现在猪和哨声旅店担当保镖。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9efd39c32b1954b023b694b0371efe1d4b129e84f49aa16d0113b5118f4cc7c9.png"
}
