package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZixorApexPredator_56451 : Card() {
    override val id = 56451
    override val name = "顶级捕食者兹克索尔"
    override val description = "<b>突袭</b> <b>亡语：</b>将“终极兹克索尔”洗入你的牌库。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "它是恐惧的化身。传送随心，神出鬼没。专吃被污染的地狱野猪肉。绝对不要随便摸它的脑袋。除非你是莱欧洛克斯。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d34474ba09c6f9d314f96a6d229eb8c30983b2b96616abaee384f8ca4d80282b.png"
}
