package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DraeneiTotemcarver_69732 : Card() {
    override val id = 69732
    override val name = "德莱尼图腾师"
    override val description = "<b>战吼：</b>每有一个友方图腾，便获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Core
    override val background = "现如今能看到历史如此悠久的图腾，以及技艺如此精湛的匠人，实属不易。"
    override val artist = "RK Post"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6138edbfcee5fdac0d5ee6f926f75f451aa8ef8e8a47a506e24fa61dba01d6fb.png"
}
