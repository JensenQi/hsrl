package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SmugglersRun_40371 : Card() {
    override val id = 40371
    override val name = "风驰电掣"
    override val description = "使你手牌中的所有随从牌获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "加基森历史上发生过多次银行抢劫案，其中最有名的一次是鱼人干的，不得不说鱼人在违法犯罪上相较于其他种族有着与生俱来的天赋。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e8f49d14dbe7a5cc8384b7f484f129ce03f257f596e895e3171349725efcef15.png"
}
