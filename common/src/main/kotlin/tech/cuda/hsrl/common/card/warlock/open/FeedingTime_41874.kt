package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FeedingTime_41874 : Card() {
    override val id = 41874
    override val name = "喂食时间"
    override val description = "对一个随从造成 3点伤害。召唤三个1/1的翼手龙。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Ungoro
    override val background = "这帮小家伙只有1/1的身材，却有着4/4的食量！"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/409b720a50e2352b51b69cc1c1dfa680a13ee9544efe31c95e4f8b03562c2558.png"
}
