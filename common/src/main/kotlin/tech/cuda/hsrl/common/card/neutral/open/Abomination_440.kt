package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Abomination_440 : Card() {
    override val id = 440
    override val name = "憎恶"
    override val description = "<b>嘲讽，亡语：</b>对所有角色造成2点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "憎恶喜欢享用新鲜的肉，以及在海滩上漫步。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/31fb3e50fbdf00b7605867fbfead723a2541a878d95a845995f777a0ca13754f.png"
}
