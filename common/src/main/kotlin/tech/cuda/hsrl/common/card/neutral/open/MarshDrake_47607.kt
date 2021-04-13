package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MarshDrake_47607 : Card() {
    override val id = 47607
    override val name = "沼泽飞龙"
    override val description = "<b>战吼：</b>为你的对手召唤一个2/1并具有<b>剧毒</b>的飞龙猎手。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "要是没有飞龙猎手来捣乱，她早就搞定敌人了。"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66e2672448438949e70c089543e93f4aabda4aa7d35da7056616a28915ce6648.png"
}
