package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DraeneiTotemcarver_2613 : Card() {
    override val id = 2613
    override val name = "德莱尼图腾师"
    override val description = "<b>战吼：</b>每有一个友方图腾，便获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Tgt
    override val background = "现如今能看到历史如此悠久的图腾，以及技艺如此精湛的匠人，实属不易。"
    override val artist = "RK Post"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/41cbd1de8308ca0985bc9820c8e041aa7be8241c89cb55370c690693a7f4cd5f.png"
}
