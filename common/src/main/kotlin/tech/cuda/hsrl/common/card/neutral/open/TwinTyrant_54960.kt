package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwinTyrant_54960 : Card() {
    override val id = 54960
    override val name = "双头暴虐龙"
    override val description = "<b>战吼：</b>随机对两个敌方随从造成4点伤害。"
    override var cost: Int? = 8
    override var health: Int? = 10
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "总有一个头嫌冷，一个头嫌热。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d06a23f4fd72013cca41eec0b66ef07d92ca8c0a0c2274697d4941504efcec2.png"
}
