package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FloatingWatcher_2068 : Card() {
    override val id = 2068
    override val name = "漂浮观察者"
    override val description = "每当你的英雄在你的回合受到伤害，便获得+2/+2。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Gvg
    override val background = "和他对话时，你很难与之进行眼神交流。"
    override val artist = "Todd Lockwood"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7d3eb56f50effc0f5a834790a214400d12c1a686f47e8e0ffc4a23b6078cd98f.png"
}
