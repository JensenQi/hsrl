package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ravencaller_46661 : Card() {
    override val id = 46661
    override val name = "唤鸦者"
    override val description = "<b>战吼：</b>随机将两张法力值消耗为（1）的随从牌置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "一呼两应。"
    override val artist = "Ben Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/34dce8ca248be0b02ed1ac7aa10eedf7e7318c3c16bce5c84b8fc8546118a766.png"
}
