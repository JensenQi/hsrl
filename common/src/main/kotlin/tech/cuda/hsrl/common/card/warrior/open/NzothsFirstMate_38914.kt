package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NzothsFirstMate_38914 : Card() {
    override val id = 38914
    override val name = "恩佐斯的副官"
    override val description = "<b>战吼：</b>装备一把1/3的锈蚀铁钩。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "作为副官成天被呼来喝去真是不胜其烦，可谁让恩佐斯是他的老板呢。"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d9686e2e499c2b622ec52aa9882782c85f48fbc8590490b292bb42202d1e7080.png"
}
