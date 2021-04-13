package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NzothTheCorruptor_38496 : Card() {
    override val id = 38496
    override val name = "恩佐斯"
    override val description = "<b>战吼：</b>召唤所有你在本局对战中死亡的，并具有<b>亡语</b>的随从。"
    override var cost: Int? = 10
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "恩佐斯会在睡前听美人鱼给它吟唱安眠曲。这个习惯保持了五千多年，从未改变。"
    override val artist = "Tyson Murphy"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4c22f7f45b35ae44c4c8b4f660c5cad283bd7e9f70948475cdb5cf99cca6101b.png"
}
