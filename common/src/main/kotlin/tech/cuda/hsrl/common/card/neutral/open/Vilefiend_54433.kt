package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vilefiend_54433 : Card() {
    override val id = 54433
    override val name = "邪犬"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "梦想化身为时尚邪犬，无奈邪能色从未流行。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1c4fab8168150ffd43a9f06a76021ac5587c3d9da565400d7b849de1e37be4cc.png"
}
