package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightDarkmender_38429 : Card() {
    override val id = 38429
    override val name = "暮光暗愈者"
    override val description = "<b>战吼：</b>如果你的克苏恩至少具有10点攻击力，便为你的英雄恢复 10点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "想用黑暗能量来治疗，先得从光里剥离出来，再用清水洗净晾干即可。"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3ac8bad66bd59b00a740c5f25c6c6abd4b0888854456e4c36d592e89cc8b3260.png"
}
