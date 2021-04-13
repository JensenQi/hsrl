package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaWraith_715 : Card() {
    override val id = 715
    override val name = "法力怨魂"
    override val description = "召唤所有随从的法力值消耗增加（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "它们在晚上出没，吸食残余的法力水晶。“嗯...”它们发出这样的声音。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/323261bd3e8afff266f2de7fc33b27a942939992c734c76069c3161a543fc2b0.png"
}
