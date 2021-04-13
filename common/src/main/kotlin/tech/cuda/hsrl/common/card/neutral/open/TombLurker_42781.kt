package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TombLurker_42781 : Card() {
    override val id = 42781
    override val name = "墓穴潜伏者"
    override val description = "<b>战吼：</b>随机将一个在本局对战中死亡并具有<b>亡语</b>的随从置入你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "你要是常年宅着不见天日，也会长成这样。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4a521c1eee075a58c306b51cf3c4fb89b4c234445c0e9e3483f6fb6151952756.png"
}
