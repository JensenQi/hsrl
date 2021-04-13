package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightDrake_1037 : Card() {
    override val id = 1037
    override val name = "暮光幼龙"
    override val description = "<b>战吼：</b> 你每有一张手牌，便获得+1生命值。"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "暮光幼龙以神秘能量为食，还吃玉米卷。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/29a1485a8fe3f1053937092b7b937e24d45739e52fe4f46859fc15ccc62379bd.png"
}
