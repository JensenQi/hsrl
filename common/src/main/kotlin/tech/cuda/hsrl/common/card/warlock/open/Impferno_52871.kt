package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Impferno_52871 : Card() {
    override val id = 52871
    override val name = "小鬼狱火"
    override val description = "使你的恶魔获得+1攻击力。对所有敌方随从造成 1点 伤害。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "粉骨碎身全不怕，要留力量在人间。"
    override val artist = "Chris Hayes"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b60e7ab6be4078794db981bc6b343d05bc3cd3a24c132875f649f8605596473e.png"
}
