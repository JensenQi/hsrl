package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SplittingAxe_53661 : Card() {
    override val id = 53661
    override val name = "分裂战斧"
    override val description = "<b>战吼：</b>召唤你的图腾的复制。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "远古萨满歌咏：“一手斧制，一手粘贴。”"
    override val artist = "Malcolm Davis"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/41657ecd847da9dbe4d99518712c85f89fe7bdbc217468ee8a09ce21e4c98873.png"
}
