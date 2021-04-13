package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrandEmpressShekzara_61162 : Card() {
    override val id = 61162
    override val name = "大女皇夏柯扎拉"
    override val description = "<b>战吼：</b>从你的牌库中<b>发现</b>一张牌，抽取它的所有复制。"
    override var cost: Int? = 6
    override var health: Int? = 7
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "大女皇究竟是指比女皇还大的女皇，还是说这个女皇体型特别大？"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/765cc5ae560a39ca34a02f22635249cb8182c36bdb44504cb319590b6ec703fb.png"
}
