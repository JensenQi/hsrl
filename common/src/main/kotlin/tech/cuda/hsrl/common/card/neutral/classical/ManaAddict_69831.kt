package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaAddict_69831 : Card() {
    override val id = 69831
    override val name = "魔瘾者"
    override val description = "在本回合中，每当你施放一个法术，便获得+2攻击力。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "她很想戒掉这嗜好，但是每当她感到压力很大的时候，她总是会吸上几口。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6ffcd252621bb18ba2d82ed07107b880edae5690ccd8c808a2739befcb009307.png"
}
