package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RaptorHatchling_41357 : Card() {
    override val id = 41357
    override val name = "迅猛龙宝宝"
    override val description = "<b>亡语：</b>将一张4/3的“迅猛龙头领”洗入你的 牌库。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Ungoro
    override val background = "等它咬掉你的手指时，你就不会觉得它可爱了。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4d03d3e3ec69a7effe8964d5f1f5de79dde5d8243e78111b5cd1c401d9cbfdb4.png"
}
