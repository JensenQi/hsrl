package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vryghoul_42714 : Card() {
    override val id = 42714
    override val name = "维库食尸鬼"
    override val description = "<b>亡语：</b>如果此时是你对手的回合，则召唤一个2/2的食尸鬼。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "其实他的真名叫“维护食尸鬼”，但遭到了卡牌名称规范委员会的强烈抗议。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30ddbe9e83e8301738525d432d140cebbbb5229ff267f4a6aa2b90c86adc5695.png"
}
