package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RockRager_60916 : Card() {
    override val id = 60916
    override val name = "岩石暴怒者"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "他始终都搞不懂自己为什么会输给布暴怒者。"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8009324188abc4eab8380e02e814f7b8df0eebc63a8653cba4d145a6098863f8.png"
}
