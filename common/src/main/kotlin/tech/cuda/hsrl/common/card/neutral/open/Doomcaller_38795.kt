package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Doomcaller_38795 : Card() {
    override val id = 38795
    override val name = "厄运召唤者"
    override val description = "<b>战吼：</b>使你的克苏恩获得+2/+2<i>（无论它在哪里）。</i>如果克苏恩死亡，将其洗入你的牌库。"
    override var cost: Int? = 8
    override var health: Int? = 9
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "为什么会有人蠢到去召唤厄运？"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ada45874bbbe02aa959ee53b480ff01dda914fb2a2866292ea8dc151b4308e27.png"
}
