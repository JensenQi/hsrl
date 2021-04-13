package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindBlast_68537 : Card() {
    override val id = 68537
    override val name = "心灵震爆"
    override val description = "对敌方英雄造成 5点伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "这个法术直接震爆你的心灵。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9bc91546cf0d1c408eed425dd0f444fb1fbf2be8d40d98d40cc656b329761d2a.png"
}
