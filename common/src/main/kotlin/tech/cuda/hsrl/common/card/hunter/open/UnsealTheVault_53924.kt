package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnsealTheVault_53924 : Card() {
    override val id = 53924
    override val name = "打开宝库"
    override val description = "<b>任务：</b>召唤20个随从。<b>奖励：</b>法老的面盔。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "“哈哈……又有新素材可以做卡背了。”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e02ab11bfc61ccf46d107380c68341c391c811214082e0666828ebfb4984f969.png"
}
