package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Mindbreaker_45314 : Card() {
    override val id = 45314
    override val name = "摧心者"
    override val description = "双方英雄技能均无法使用。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "他会摧心，夺梦，还会训练食尸鬼，所以别惹他。"
    override val artist = "Chris Rahn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ae965d979b3ecbaa955dd1d3046df293e02e33675eaa67b4b3dd8889b2f8d5b.png"
}
