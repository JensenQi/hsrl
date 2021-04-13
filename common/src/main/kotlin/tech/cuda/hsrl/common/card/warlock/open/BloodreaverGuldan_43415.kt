package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BloodreaverGuldan_43415 : Card() {
    override val id = 43415
    override val name = "鲜血掠夺者古尔丹"
    override val description = "<b>战吼：</b>召唤所有在本局对战中死亡的友方恶魔。"
    override var cost: Int? = 10
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Kotf
    override val background = "“还不肯跪服吗？没有人能逃脱死亡，你这个顽固的蠢货。而在死后……一切都将臣服于我……”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4abce631661efe4609fa9884d812f46001ed613eb0457b4ae96bf0f68ed606d2.png"
}
