package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PsychicScream_43112 : Card() {
    override val id = 43112
    override val name = "心灵尖啸"
    override val description = "将所有随从洗入你对手的牌库。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "所有人，都来牌库这！"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e7c4d08578e8b13bc609f04dc9373e7eaafb92e8ed9cbb3ed886e623a56d3f67.png"
}
