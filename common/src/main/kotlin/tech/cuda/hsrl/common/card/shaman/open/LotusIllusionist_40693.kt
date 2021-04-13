package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LotusIllusionist_40693 : Card() {
    override val id = 40693
    override val name = "玉莲帮幻术师"
    override val description = "在该随从攻击一方英雄后，随机将其变形成为一个法力值消耗为（6）的随从。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "她的易容术非常厉害。她装扮过萨维斯，希尔瓦娜斯，还有雷诺·杰克逊！"
    override val artist = "Luke Mancini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e4c809477663b17d98c088357903a45e8d3e83dc6d7098b3fca3148f96cc1e3.png"
}
