package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FormerChamp_50731 : Card() {
    override val id = 50731
    override val name = "退役冠军"
    override val description = "<b>战吼：</b>召唤一个5/5的赛场新秀。"
    override var cost: Int? = 5
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "他退役的时候，送葬者还是赛场一霸。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f1a413934053e0ae873b5d3950343a940c799692bcce8107c8a74f3fdbaef2bb.png"
}
