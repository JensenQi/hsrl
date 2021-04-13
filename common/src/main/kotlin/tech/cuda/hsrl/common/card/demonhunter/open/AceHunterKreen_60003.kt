package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AceHunterKreen_60003 : Card() {
    override val id = 60003
    override val name = "金牌猎手克里"
    override val description = "你的其他角色在攻击时具有<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "大师级猎手，喜好赢得比赛和吃冰淇淋。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9b554c5d9bcb9cb565b947706d99737eee7b980f659f2b5683694ce1bc285e3f.png"
}
