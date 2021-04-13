package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Malygos_436 : Card() {
    override val id = 436
    override val name = "玛里苟斯"
    override val description = "<b>法术伤害+5</b>"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "玛里苟斯憎恨凡人使用魔法。那会让他气急败坏！"
    override val artist = "Michael Komarck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5958072d2c686b07554233f17e8e51d669aea80e2e582e3815d869d96d257ff6.png"
}
