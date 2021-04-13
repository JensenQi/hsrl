package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SafetyInspector_62049 : Card() {
    override val id = 62049
    override val name = "安全检查员"
    override val description = "<b>战吼：</b>把你手牌中法力值消耗最低的牌洗入牌库。抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“检查完了，你这里搞得不错。没发现任何安全因素。”"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/216dccfbd5bf603482c76712993145560c3147b29909006731724f046d900ef1.png"
}
