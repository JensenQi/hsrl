package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HappyGhoul_42783 : Card() {
    override val id = 42783
    override val name = "开心的食尸鬼"
    override val description = "在本回合中，如果你的英雄受到治疗，则 法力值消耗为（0）点。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "做鬼呢，最重要的就是开心咯…"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c01cd120d76532cea27cb52a63ab49ef88d8865efaede34300de485d602ac989.png"
}
