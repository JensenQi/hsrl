package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaAddict_12 : Card() {
    override val id = 12
    override val name = "魔瘾者"
    override val description = "在本回合中，每当你施放一个法术，便获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "她很想戒掉这嗜好，但是每当她感到压力很大的时候，她总是会吸上几口。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2e437e23b56d2a43c6e61670249654e5de957804853e4fc780d3b4a7c0fcfc6a.png"
}
