package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightDrake_69824 : Card() {
    override val id = 69824
    override val name = "暮光幼龙"
    override val description = "<b>战吼：</b> 你每有一张手牌，便获得+1生命值。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "暮光幼龙以神秘能量为食，还吃玉米卷。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f2893a8620d1e4b07005fd5c7f3582c2756f3116729a6e2321a41e0824acb22.png"
}
