package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneNullifierX1_2059 : Card() {
    override val id = 2059
    override val name = "施法者克星X-21"
    override val description = "<b>嘲讽，</b>无法成为法术或英雄技能的目标。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "在将这款机械装置投入生产之前，侏儒工程师们与法师们不知进行了多少次谈判。"
    override val artist = "Zero"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6bd8bf56ca255dcc4a51d57b1a02b03061fdb633e979405de10ecc0aeafd9213.png"
}
