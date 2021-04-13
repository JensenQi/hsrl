package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DjinniOfZephyrs_2925 : Card() {
    override val id = 2925
    override val name = "西风灯神"
    override val description = "在你对一个其他友方随从施放法术后，将法术效果复制在此随从身上。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "如果愿望没有实现，一定是你擦灯的方式不对。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/97243e3646d7b86081ec5a9d26b54fe1a96b2688f74115d7b1bbb3ab72d0ef11.png"
}
